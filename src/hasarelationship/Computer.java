package hasarelationship;

public class Computer {
	private String compName;
	private CPU cpu = new CPU("Intel core i7");
	private RAM ram = new RAM(16,"DDR7");
	public void setName(String compName) {
		this.compName = compName;
	}
	Computer(String compName){
		this.compName = compName;
	}
	public String getComp() {
		return String.format("model name : %s\nCPU : %s\nRAM size : %dGB\nRAM type : %s",compName,cpu.getCpuName(),ram.getSize(),ram.getModel());
	}
	public RAM getRam() {
		return ram;
	}
	public CPU getCpu() {
		return cpu;
	}
}
