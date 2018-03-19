package Patient;
import Blood.BloodData;
    public class Patient
    {
        private int patientId;
        private int patientAge;
        private BloodData patientBloodData;
        public Patient()
        {
            patientId = 0;
            patientAge = 0;
            patientBloodData = new BloodData("O", '-');
            class BloodData
            {
                String type;
                char factor;
                public BloodData(String typ, char fact)
                {
                    type = typ;
                    factor = fact;
                }
            }
        }
        public Patient(int id, int age, String type, char factor)
        {
            patientId = id;
            patientAge = age;
            BloodData patientBloodData = new BloodData("O", '+');
        }
        public int getPatientId()
        {
            return patientId;
        }
        public int PatientAge()
        {
            return patientAge;
        }
        public String getPatientBloodData(String type)
        {
            return type;
        }
        public char getPatientBloodData(char factor)
        {
            return factor;
        }
    }

