package com.kuku.administrator.form;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class FileForm {
	
	CommonsMultipartFile photoimg;

	public CommonsMultipartFile getPhotoimg() {
		return photoimg;
	}

	public void setPhotoimg(CommonsMultipartFile photoimg) {
		this.photoimg = photoimg;
	}

}
