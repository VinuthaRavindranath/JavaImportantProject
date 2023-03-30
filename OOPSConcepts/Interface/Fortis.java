package OOPSConcepts.Interface;

public class Fortis extends HospitalRegulations implements USMedical,UKMedical,IndianMedical{

    @Override
    public void cardioServices() {
        System.out.println("US medical Fortis service regulation");
    }

    @Override
    public void physioServices() {
        System.out.println("US medical Fortis physio regulation");
    }

    @Override
    public void neuroServices() {
        System.out.println("US medical Fortis neuro regulation");
    }

    @Override
    public void entServices() {
        System.out.println("UK medical Fortis ent regulation");
    }

    @Override
    public void dentalServices() {
        System.out.println("UK medical Fortis dental regulation");
    }

    @Override
    public void oncologyServices() {
        System.out.println("Indian medical Fortis oncology regulation");
    }

    @Override
    public void gynicServices() {
        System.out.println("Indian medical Fortis gynic regulation");
    }

    @Override
    public void orthoServices() {
        System.out.println("Indian medical Fortis ortho regulation");
    } 

    public void pathologyServices(){
        System.out.println("Fortis Hospital pathology service");
    }

    public void medicalTraining(){
        System.out.println("Fortis Hospital Medical Training service");
    }

    @Override
    public void emergencyServices() {
        System.out.println("Fortis Hospital emergency services");
    }

    @Override
    public void covidVaccination() {
        System.out.println("Fortis hospital covid vaccination");
    }

    @Override
    public void isiCretified() {
        System.out.println("Hospital standards");
    }
}
