package org.eclipsercp.e4.texteditor;

public class FileInput {

	private String selectedFile;

	public FileInput(String selectedFile) {
		this.setSelectedFile(selectedFile);
		// TODO Auto-generated constructor stub
	}

	public String getSelectedFile() {
		return selectedFile;
	}

	private void setSelectedFile(String selectedFile) {
		this.selectedFile = selectedFile;
	}

}
