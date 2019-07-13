package diary;

public class Diary {
	 long id;
	 String title;
	 String content;
	 String pubdate;
	 String userID;
	 int Visible;	
	 
	 public Diary(String title, String content,int visible) {
			

			this.title = title;
			this.content = content;
			this.Visible=visible;
			this.userID="1";
		}
	 

	public  long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(int v) {
		this.Visible= v;
	}
	public int getVisible() {
		return this.Visible;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPubdate() {
		return pubdate;
	}
	public void setPubdate(String pubdate) {
		this.pubdate = pubdate;
	}
	public String getUserid() {
		return this.userID;
	}

	



	

}
