package com.spring.model;

	 
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileBucket {
	 
	    MultipartFile file;
	     
	    public MultipartFile getFile() {
	        return file;
	    }
	 
	    public void setFile(MultipartFile file) {
	        this.file = file;
	    }
	}


