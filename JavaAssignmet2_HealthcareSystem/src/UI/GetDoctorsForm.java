/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Model.PatientDirectory;
import Model.DoctorDirectory;
import Model.HospitalDirectory;
import Model.Doctor;
import Model.Patient;
import Model.MedSystem;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class GetDoctorsForm extends javax.swing.JPanel {

    /**
     * Creates new form GetDotorsForm
     */
    MedSystem ms;
    String patientName;
        
    public GetDoctorsForm(MedSystem ms, String patientName) {
        this.ms = ms;
        this.patientName = patientName;
        initComponents();
        Patient patient = getPatient(patientName);
        displayDoctors(patient);
    }

    private Patient getPatient(String patientName) {
        for(Patient p:ms.getPatientList().getPatients()) {
            if(p.getFullName().equals(patientName))
                return p;
        }
        return null;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        doctorsList = new javax.swing.JScrollPane();
        tblDoctors = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 204, 204));

        jPanel1.setBackground(new java.awt.Color(255, 0, 51));

        tblDoctors.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Doctor", "Hospital", "Community"
            }
        ));
        doctorsList.setViewportView(tblDoctors);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Doctors");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(doctorsList, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel1)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(doctorsList, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

        private void displayDoctors(Patient patient) {
        //if(patient == null)
          //  return;
        
        //String patientCommunity = patient.getResidence().getCommunity().getCommunity();
        
        
        DefaultTableModel model = (DefaultTableModel)tblDoctors.getModel();
        for(Doctor d:ms.getDoctorList().getDoctors()) {
             System.out.println("Inside Display Doctors function");
                System.out.println("Doctors--->"+ms.getDoctorList().getDoctors());
                System.out.println("Hospital's Community--->"+d.getHospital().getCommunity());
                
            if(d.getHospital().getCommunity().length()>0) {
                Object[] row = new Object [3];
                row[0] = d.getDoctorName();
                row[1] = d.getHospital().getHospitalName();
                row[2] = d.getHospital().getCommunity();
                model.addRow(row);
                
                System.out.println("Inside Display Doctors function");
                System.out.println("Doctors--->"+ms.getDoctorList().getDoctors());
                System.out.println("Hospital's Community--->"+d.getHospital().getCommunity());
                
                
                
            }  
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane doctorsList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable tblDoctors;
    // End of variables declaration//GEN-END:variables
}
