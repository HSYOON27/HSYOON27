package com.kh.spring13.configuration;

import java.io.File;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@ConfigurationProperties(prefix = "custom.fileupload")
@Data
public class FileUploadProperties {
	private String path;
	
	public File getDirectory() {
		return new File(path);
	}
}
