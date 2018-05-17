package board.model;

public class CateVO {

	private Integer cate_seq;
	private String cate_mem_id;
	private String cate_title;
	private String cate_dt;
	private String cate_act_yn;
	
	public Integer getCate_seq() {
		return cate_seq;
	}
	public void setCate_seq(Integer cate_seq) {
		this.cate_seq = cate_seq;
	}
	public String getCate_mem_id() {
		return cate_mem_id;
	}
	public void setCate_mem_id(String cate_mem_id) {
		this.cate_mem_id = cate_mem_id;
	}
	public String getCate_title() {
		return cate_title;
	}
	public void setCate_title(String cate_title) {
		this.cate_title = cate_title;
	}
	public String getCate_dt() {
		return cate_dt;
	}
	public void setCate_dt(String cate_dt) {
		this.cate_dt = cate_dt;
	}
	public String getCate_act_yn() {
		return cate_act_yn;
	}
	public void setCate_act_yn(String cate_act_yn) {
		this.cate_act_yn = cate_act_yn;
	}
	
	@Override
	public String toString() {
		return "CateVO [cate_seq=" + cate_seq + ", cate_mem_id=" + cate_mem_id
				+ ", cate_title=" + cate_title + ", cate_dt=" + cate_dt
				+ ", cate_act_yn=" + cate_act_yn + "]";
	}
	
	
	
}
