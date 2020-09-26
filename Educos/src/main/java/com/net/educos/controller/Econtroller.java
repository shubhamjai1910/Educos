package com.net.educos.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.net.educos.model.DBFile;
import com.net.educos.model.Faculty;
import com.net.educos.payload.UploadFileResponse;
import com.net.educos.service.DBFileStorageService;
import com.net.educos.service.FserviceImpl;

@RestController
@RequestMapping("/educos")
@SessionAttributes("name")
    public class Econtroller {
	
    private static final Logger logger = LoggerFactory.getLogger(Econtroller.class);

	@Autowired
	private FserviceImpl service;

    @Autowired
    private DBFileStorageService DBFileStorageService;
	
	@RequestMapping(value = { "/home" }, method = RequestMethod.GET)
	public ModelAndView home() {
		 
		ModelAndView model = new ModelAndView();
		model.setViewName("home");
		return model;
		
	}
	@RequestMapping(value = { "/facultyadd" }, method = RequestMethod.GET)
	public ModelAndView addFaculty() {
		 
	    Faculty faculty = new Faculty();
		ModelAndView model = new ModelAndView();
		model.addObject("faculties",faculty);
		model.setViewName("facultyreg");
		return model;
		
	}
	
	@RequestMapping("uploadfile")
	public ModelAndView upload()
	{
		ModelAndView model = new ModelAndView();
		DBFile dbfile = new DBFile();
		model.addObject("fileupload",dbfile);
		model.setViewName("uploadfile");
		return model;
	}
	
	@PostMapping("/uploadFile")
    public UploadFileResponse uploadFile(@RequestParam("file") MultipartFile file) {
        DBFile dbFile = DBFileStorageService.storeFile(file);

        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/downloadFile/")
                .path(dbFile.getId())
                .toUriString();

        return new UploadFileResponse(dbFile.getFileName(), fileDownloadUri,
                file.getContentType(), file.getSize());
    }

    @PostMapping("/uploadMultipleFiles")
    public List<UploadFileResponse> uploadMultipleFiles(@RequestParam("files") MultipartFile[] files) {
        return Arrays.asList(files)
                .stream()
                .map(file -> uploadFile(file))
                .collect(Collectors.toList());
    }

    @GetMapping("/downloadFile/{fileId}")
    public ResponseEntity<Resource> downloadFile(@PathVariable String fileId) {
        // Load file from database
        DBFile dbFile = DBFileStorageService.getFile(fileId);

        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(dbFile.getFileType()))
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + dbFile.getFileName() + "\"")
                .body(new ByteArrayResource(dbFile.getData()));
    }

	@RequestMapping(value = { "/map" }, method = RequestMethod.GET)
	public ModelAndView map() {
		 
		ModelAndView model = new ModelAndView();
		model.setViewName("map");
		return model;
		
	}

	
    @RequestMapping(value={"/flist"},method = RequestMethod.GET)
	public ModelAndView getAllFaculty(){
    	
       ModelAndView model=new ModelAndView();
       List<Faculty>list=service.getAllFaculty();
       model.addObject("facultylist",list);
       model.setViewName("facultylist");
       return model;
		
	}

	
	
	//update & delete 
	@RequestMapping(value="/update/{id}",method = RequestMethod.GET)
	public ModelAndView editFaculty(@PathVariable int id){
	ModelAndView model=new ModelAndView();
	Faculty faculty=service.findFacultyById(id);
	model.addObject("faculties",faculty);
	model.setViewName("facultyreg");
	return model;
	}
	
	@RequestMapping(value="/delete/{id}",method = RequestMethod.GET)
	public ModelAndView deleteFaculty(@PathVariable("id")int id) {
	service.deleteFaculty(id);
	return new ModelAndView("redirect:/educos/flist");
	
	}

	@RequestMapping(value = { "/student" }, method = RequestMethod.GET)
	public ModelAndView student() {
		 
		ModelAndView model = new ModelAndView();
		model.setViewName("studentreg");
		return model;
		
	}
	
	
	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public ModelAndView saveOrUpdate(@ModelAttribute("faculties") Faculty faculty)
	{
		if (faculty.getFid() != 0)
		{
			service.updateFaculty(faculty);
		}
		else
		{
		service.addFaculty(faculty);
		}
		return new ModelAndView("redirect:/educos/home");
	}
	
	//profile 
	
	@RequestMapping(value = "fprofile")
	public ModelAndView profile()
	{
		ModelAndView model = new ModelAndView("profile");
		return model;
	}
	
	
	//Upload file
	public static String uploadDirectory = System.getProperty("user.dir")+"/uploadAssignment";
	
	@RequestMapping("/")
	public String UploadPage(Model model) {
		return "assignment";
	}
	
	@RequestMapping("/upload")
	public String upload(Model model , @RequestParam("files") MultipartFile[] files) {
		
		StringBuilder fileNames = new StringBuilder();//for holding file names
		for(MultipartFile file : files)
		{
			Path fileNameAndPath=Paths.get(uploadDirectory, file.getOriginalFilename());
			fileNames.append(file.getOriginalFilename()+ "");
			try {
				Files.write(fileNameAndPath,file.getBytes());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		model.addAttribute("msg", "succesfully upload files" +fileNames.toString());
		return "assignment";
	}


	
}
