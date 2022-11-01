package Model;

/**
 *
 * @author admin
 */

public class MedSystem {
    
    private PatientDirectory patientList;
    private PersonDirectory personList;
    private DoctorDirectory doctorList;
    private HospitalDirectory hospitalList;
    
    private City city;
    
    public MedSystem(){
        
        personList = new PersonDirectory();
        patientList  = new PatientDirectory();
        doctorList = new DoctorDirectory();
        hospitalList = new HospitalDirectory();
        initializeHospitalDoctorDirectories();
    }
    private void initializeHospitalDoctorDirectories(){
        Hospital h1 = new Hospital("Ashwini Hospital", "Huntington");
        Hospital h2 = new Hospital("Harvard Hospital", "Cambridge");
        Hospital h3 = new Hospital("UMass Hospital", "Roxbury");
        
        this.hospitalList.addHospital(h1);
        this.hospitalList.addHospital(h2);
        this.hospitalList.addHospital(h3);
        
        this.doctorList.addDoctor(new Doctor("doctor1", h1));
        this.doctorList.addDoctor(new Doctor("doctor2", h1));
        this.doctorList.addDoctor(new Doctor("doctor3", h2));
        this.doctorList.addDoctor(new Doctor("doctor4", h2));
        this.doctorList.addDoctor(new Doctor("doctor5", h3));
        this.doctorList.addDoctor(new Doctor("doctor6", h3));
        for(int i=0;i<doctorList.getDoctors().size();i++)
        {
            System.out.println(doctorList.getDoctors().get(i).doctorName);
        } 

        System.out.println("DoctorList --->"+doctorList);
        System.out.println("hospitalList --->"+this.hospitalList);
    }
            
    public void addPerson(Person p){
        personList.addPerson(p);
    }

    public void addPatient(Patient p){
        patientList.addPatients(p);
    }
    
    
    
    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public PatientDirectory getPatientList() {
        return patientList;
    }

    public DoctorDirectory getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(DoctorDirectory doctorList) {
        this.doctorList = doctorList;
    }

    public HospitalDirectory getHospitalList() {
        return hospitalList;
    }

    public void setHospitalList(HospitalDirectory hospitalList) {
        this.hospitalList = hospitalList;
    }

    public void setPatientList(PatientDirectory patientList) {
        this.patientList = patientList;
    }

    public PersonDirectory getPersonList() {
        return personList;
    }

    public void setPersonList(PersonDirectory personList) {
        this.personList = personList;
    }

    public Person searchUser(int txtId) {
        System.out.println("idid:"+txtId);
        return personList.searchUser(txtId);
    }

    public void encounterPatient(int id, Encounter enc) {
        patientList.encounterPatient(id, enc);
    }

    public void deletePerson(int id) {
        personList.deletePerson(id);
    }

    public void deletePatient(int id) {
        patientList.deletePatient(id);
    }

   

}
