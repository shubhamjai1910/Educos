package com.net.educos.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.net.educos.model.DBFile;
@Repository
public interface DBFileRepository extends JpaRepository<DBFile, String>{

}
