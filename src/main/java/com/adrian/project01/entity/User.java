package com.adrian.project01.entity;

import java.net.URI;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.springframework.format.annotation.DateTimeFormat;

public class User {

	@Pattern(regexp = "\\S{2,30}")
	private String userName;
	@Email
	@NotNull
	private String email;

	/** optional first screen attributes */

	private String displayedName;
	private String description;
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	private Date birthday;
	private URI profilePic;

	/** lifecycle and customization attributes */

	private Size defaultSize;

	/** e.g. "normal" and "pregnant" */
	private List<Size> sizes;
	// private List<Wardrobe> wardrobes;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDisplayedName() {
		return displayedName;
	}

	public void setDisplayedName(String displayedName) {
		this.displayedName = displayedName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Size getDefaultSize() {
		return defaultSize;
	}

	public void setDefaultSize(Size defaultSize) {
		this.defaultSize = defaultSize;
	}

	public List<Size> getSizes() {
		return sizes;
	}

	public void setSizes(List<Size> sizes) {
		this.sizes = sizes;
	}

	// public List<Wardrobe> getWardrobes() {
	// return wardrobes;
	// }
	//
	// public void setWardrobes(List<Wardrobe> wardrobes) {
	// this.wardrobes = wardrobes;
	// }

	public URI getProfilePic() {
		return profilePic;
	}

	public void setProfilePic(URI profilePic) {
		this.profilePic = profilePic;
	}

}
