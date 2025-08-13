package com.example.myapp.board.model;

import lombok.Data;

@Data
public class BoardUploadFile {
	private int fileId;
	private long fileSize;
	private int boardId;
	private String fileName;
	private String fileContentType;
	private byte[] fileData;
}
