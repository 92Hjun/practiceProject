package kr.co.blog.vo;

public class Todo {
	
	private int no;
	private String title;
	private String contents;
	private String startDate;
	private String endDate;
	private String userId;
	private String completed;
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getCompleted() {
		return completed;
	}
	public void setCompleted(String completed) {
		this.completed = completed;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "Todo [no=" + no + ", title=" + title + ", contents=" + contents + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", userId=" + userId + ", completed=" + completed + "]";
	}
}
