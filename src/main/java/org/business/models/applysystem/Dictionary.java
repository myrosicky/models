package org.business.models.applysystem;

public class Dictionary {
	public enum Status {
		ONGOING("ONGOING","进行中")
		, COMPLETED("COMPLETED","已完成")
		, HANDOVER("HANDOVER","交给同事")
		;
		DictionaryItem dict;
		Status(String value, String comment){
			dict = new DictionaryItem("status",value,comment);
		}
		public DictionaryItem getDictionary(){
			return dict;
		}

	}
	
	public enum Category {
		EMAIL("EMAIL","邮件")
		,PHONE("PHONE","电话");
		DictionaryItem dict;
		Category(String value, String comment){
			dict = new DictionaryItem("category",value,comment);
		}
		public DictionaryItem getDictionary(){
			return dict;
		}
	}
	
	public enum Deleted{
		FALSE("0")
		,TRUE("1")
		;
		private String value;
		Deleted(String value){
			this.value = value;
		}
		
		@Override
		public String toString() {
			return this.value;
		}
	}
	
	public enum Type{
		INDIVIDUAL("0"), 
		CORPORATION("1"),
		OTHER("2")
		;
		private String value;
		Type(String value){
			this.value = value;
		}
		@Override
		public String toString() {
			return this.value;
		}
	}
	
	public enum ApproveType{
		APPROVE("1"),
		REVIEW("2")
		;
		
		private String value;
		ApproveType(String value){
			this.value = value;
		}
		@Override
		public String toString() {
			return this.value;
		}
	}
	
	public enum ApproveResult{
		SAVE("1"), 
		PASS("2"), 
		FAIL("3")
		;
		private String value;
		ApproveResult(String value){
			this.value = value;
		}
		@Override
		public String toString() {
			return this.value;
		}
	}
	
	
	public enum FlowStep{
		CREATE ("1"),       
		PEND_ACCEPT ("2"),  
		ACCEPTTED ("3"),    
		PEND_APPROVE ("4"), 
		APPROVED ("5"),     
		PEND_REVIEW ("6"),  
		REVIEWED ("7"),     
		COMPLETE ("8"),     
		FAILURE ("9")    
		;
		private String value;
		FlowStep(String value){
			this.value = value;
		}
		@Override
		public String toString() {
			return this.value;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
    
	

}
