package sample;

public class Links {

	private Self self;
	private Edit edit;
	private Avatar avatar;

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public Links() {
	}

	/**
	 *
	 * @param edit
	 * @param self
	 * @param avatar
	 */
	public Links(Self self, Edit edit, Avatar avatar) {
		super();
		this.self = self;
		this.edit = edit;
		this.avatar = avatar;
	}

	public Self getSelf() {
		return self;
	}

	public void setSelf(Self self) {
		this.self = self;
	}

	public Edit getEdit() {
		return edit;
	}

	public void setEdit(Edit edit) {
		this.edit = edit;
	}

	public Avatar getAvatar() {
		return avatar;
	}

	public void setAvatar(Avatar avatar) {
		this.avatar = avatar;
	}

}