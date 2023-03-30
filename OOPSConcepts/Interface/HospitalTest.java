package OOPSConcepts.Interface;

public class HospitalTest {
    public static void main(String[] args) {
        Fortis fortis = new Fortis();
        fortis.cardioServices();
        fortis.physioServices();
        fortis.neuroServices();
        fortis.oncologyServices();
        fortis.dentalServices();
        fortis.gynicServices();
        fortis.orthoServices();
        fortis.entServices();
        fortis.pathologyServices();
        fortis.medicalTraining();
        fortis.emergencyServices();
        fortis.medicalRandD();
        fortis.MedicalNews();
        fortis.covidVaccination();
        fortis.isiCretified();


        USMedical usmedical = new Fortis();
        usmedical.cardioServices();
        usmedical.emergencyServices();
        usmedical.neuroServices();
        usmedical.physioServices();

        UKMedical ukMedical= new Fortis();
        ukMedical.dentalServices();
        ukMedical.entServices();
        ukMedical.emergencyServices();

        IndianMedical indianMedical= new Fortis();
        indianMedical.gynicServices();
        indianMedical.oncologyServices();
        indianMedical.orthoServices();
        indianMedical.emergencyServices();

        //Can we achieve complie time downCasting using interfaces?
        //Fortis fortis =new USMedical();
        //this not possible because we cannot create an object of interface

    }
    
}
