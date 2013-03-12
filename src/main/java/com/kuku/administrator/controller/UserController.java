package com.kuku.administrator.controller;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;

import org.hibernate.annotations.Parameter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.kuku.administrator.form.FileForm;
import com.kuku.administrator.form.LoginForm;

@Controller
public class UserController {
	
	/**
	 * 	Method to redirect to login page
	 * 
	 *  @param model Anotation for setting the object to Form
	 *  @param LoginForm Object linked to Form view
	 *  @return A String that especifies the view to resolve
	 *  
	 * **/
	
	@RequestMapping(value = "/updateImageProfile", method = RequestMethod.POST)
	public @ResponseBody String showLogin(@ModelAttribute FileForm fileForm,@RequestParam("url") String url) {
		
		System.out.println("URLLLLLLLLLLLLL --> " + url);
		try {
            grabarFicheroALocal(fileForm);
        } catch (Exception e) {
            e.printStackTrace();
            return "No se ha podido grabar el fichero";
        }
         
		
		/*
		BufferedImage img = null;
		
	      try {
	    	  System.out.println("url --> " + request.getInputStream());
	        
	    	  img = ImageIO.read(new File(url.substring(12)));
	    	  
	      } catch (IOException ex) {
	    	  
	          System.out.println("No se pudo leer la imagen");
	      }*/ 

		
		return "<img src='http://ravmn.cl/sites/default/files/adjuntos/ManifiestoHackerIcono.png'/>";

	}
	
	 private void grabarFicheroALocal(FileForm fileForm) throws Exception {
	        CommonsMultipartFile uploaded = fileForm.getPhotoimg();
	        File localFile = new File("/home/norveos/imagenes/"+uploaded.getOriginalFilename());
	        FileOutputStream os = null;
	         
	        try {
	             
	            os = new FileOutputStream(localFile);
	            os.write(uploaded.getBytes());
	             
	        } finally {
	            if (os != null) {
	                try {
	                    os.close();
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            }
	        }
	    }

}
