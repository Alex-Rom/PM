package ro.jademy.domain;

import java.util.ArrayList;

import org.apache.commons.fileupload.FileItem;

import ro.jademy.dao.DaoImpl;

public class Factory {

	public static DaoImpl daoImpl = new DaoImpl();
	public static User user = new User(null, null, null, null, null, null);
	public static ArrayList<FileItem> files = new ArrayList<FileItem>();

}
