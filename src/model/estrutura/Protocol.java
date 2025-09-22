package model.estrutura;

public class Protocol {
		private String type;
		private String data;
		private Protocol nextProtocol;
		private Protocol previousProtocol;
		private DataList dataList; // lista FIFO simples
		
		
		// criar nó com tipo especifico
		// e os dados que entrarão no nó
		public Protocol(String type, String data) {
			this.type = type;
			this.data = data;
			this.nextProtocol = null;
			this.previousProtocol = null;
			this.dataList = new DataList();
			
		}
		
		public String getType() {
				return this.type;
			
		}
		
		public void setType(String type) {
				this.type = type;
			
		}
		
		public String getData() {
				return this.data;
				
		}
		
		public void setData(String data) {
				this.data = data;
			
		}
		
		public Protocol getNextProtocol() {
				return this.nextProtocol;
				
		}
		
		public void setNextProtocol(Protocol nextProtocol) {
				this.nextProtocol = nextProtocol;
				
		}
		
		public Protocol getPreviousProtocol() {
				return this.previousProtocol;
				
		}
		
		public void setPreviousProtocol(Protocol previousProtocol) {
				this.previousProtocol = previousProtocol;
				
		}
		
		public DataList getDataList() {
			return this.dataList;
		}
		
		
		@Override
		public String toString() {
			return (this.type + this.data);
		}
		
	
}