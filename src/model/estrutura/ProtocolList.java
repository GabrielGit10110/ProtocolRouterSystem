package model.estrutura;

public class ProtocolList {
	Protocol last;
	int size;
	
	public ProtocolList() {
		this.last = null;
		this.size = 0;
	}
	
	public void append(String type, String data) {
		Protocol newProtocol = new Protocol(type, data);
		if (this.last == null) {
			this.last = newProtocol;
			
			newProtocol.setNextProtocol(newProtocol);
			newProtocol.setPreviousProtocol(newProtocol);
			
		} else {
			Protocol lastProtocol = this.last;
			Protocol firstProtocol = this.last.getNextProtocol();
			
			newProtocol.setPreviousProtocol(lastProtocol);
			newProtocol.setNextProtocol(firstProtocol);
			firstProtocol.setPreviousProtocol(newProtocol);
			lastProtocol.setNextProtocol(newProtocol);
			
			this.last = newProtocol;
			
		}
		
		this.size++;
		
	}
	
	public Protocol get(String type) {
		if (this.last == null) {
			throw new IllegalArgumentException("Lista de protocolos vazia...");
		}
		
		Protocol pointer = this.last.getNextProtocol();
		
		while (pointer != this.last && pointer.getType() != type) {
			pointer = pointer.getNextProtocol();
			
		}
		
		if (pointer.getType().equals(type)) {
			return pointer;
		} else {
			return null;
		}
		
	}
	
	public Protocol getOrAddProtocol(String type, String data) {
		Protocol newProtocol = new Protocol(type, data);
		
		if (this.last == null) {
			this.last = newProtocol;
			
			newProtocol.setPreviousProtocol(newProtocol);
			newProtocol.setNextProtocol(newProtocol);
			return newProtocol;
		}
		
		Protocol pointer = this.last.getNextProtocol();
		
		while (pointer != this.last && pointer.getType() != newProtocol.getType()) {
			pointer = pointer.getNextProtocol();
		}
		
		// elemento existe na lista
		if (pointer.getType().equals(newProtocol.getType())) {
			return pointer;
		// elemento nao existe
		} else {
			Protocol firstProtocol = this.last.getNextProtocol();
			
			newProtocol.setPreviousProtocol(pointer);
			newProtocol.setNextProtocol(firstProtocol);
			firstProtocol.setPreviousProtocol(newProtocol);
			pointer.setNextProtocol(newProtocol);
			
			this.size++;
			return newProtocol;
		}
	}
	
	public void remove(String type) throws IllegalArgumentException {
		Protocol toRemove = get(type);

		Protocol next = toRemove.getNextProtocol();
		Protocol previous = toRemove.getPreviousProtocol();
		if (this.last.getType().equals(type) && previous == toRemove && next == toRemove) {
			this.last = null;
			this.size--;
			return;
			
		}
		
		previous.setNextProtocol(next);
		next.setPreviousProtocol(previous);
		
		if (this.last == toRemove) {
			this.last = previous;
		}

		toRemove.setNextProtocol(null);
		toRemove.setPreviousProtocol(null);
		toRemove.setType(null);
		toRemove.setData(null);
		
	}
	public Protocol getLast() throws IllegalArgumentException {
		if (this.last == null) {
			throw new IllegalArgumentException("Lista vazia, nao existe ultimo item...");
		} else {
			return this.last;
		}
	}
	
	public int size() {
		return this.size;
		
	}
	

}
