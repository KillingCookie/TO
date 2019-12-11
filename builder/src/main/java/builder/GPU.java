package builder;

public class GPU {

    private String brand, graphicProcessor, VRAMType;
    private int VRAM, busWidth, memoryClockSpeed;

    private GPU(){}

    public static class Builder{

        private String brand, graphicProcessor, VRAMType;
        private int VRAM, busWidth, memoryClockSpeed;

        public Builder(String brand){this.brand = brand;}

        public Builder graphicProcessor(String graphicProcessor){

            this.graphicProcessor = graphicProcessor;
            return this;

        }

        public Builder VRAMType(String VRAMType){

            this.VRAMType = VRAMType;
            return this;

        }

        public Builder memoryClockSpeed(int memoryClockSpeed){

            this.memoryClockSpeed = memoryClockSpeed;
            return this;

        }

        public Builder VRAM(int VRAM){

            this.VRAM = VRAM;
            return this;

        }

        public Builder busWidth(int busWidth){

            this.busWidth = busWidth;
            return this;

        }

        public GPU build() {

            GPU gpu = new GPU();

            gpu.brand = this.brand;
            gpu.graphicProcessor = this.graphicProcessor;
            gpu.VRAMType = this.VRAMType;
            gpu.memoryClockSpeed = this.memoryClockSpeed;
            gpu.VRAM = this.VRAM;
            gpu.busWidth = this.busWidth;

            return gpu;

        }

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getGraphicProcessor() {
        return graphicProcessor;
    }

    public void setGraphicProcessor(String graphicProcessor) {
        this.graphicProcessor = graphicProcessor;
    }

    public String getVRAMType() {
        return VRAMType;
    }

    public void setVRAMType(String VRAMType) {
        this.VRAMType = VRAMType;
    }

    public int getMemoryClockSpeed() {
        return memoryClockSpeed;
    }

    public void setMemoryClockSpeed(int memoryClockSpeed) {
        this.memoryClockSpeed = memoryClockSpeed;
    }

    public int getVRAM() {
        return VRAM;
    }

    public void setVRAM(int VRAM) {
        this.VRAM = VRAM;
    }

    public int getBusWidth() {
        return busWidth;
    }

    public void setBusWidth(int busWidth) {
        this.busWidth = busWidth;
    }
}
