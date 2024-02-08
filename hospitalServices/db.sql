use hospital_management;

INSERT INTO doctor (city, email, name, phone_number, speciality) VALUES
    -> ('Delhi', 'ritu.gupta@example.com', 'Dr. Ritu Gupta', '9876543213', 'Orthopedic'),
    -> ('Delhi', 'pooja.sharma@example.com', 'Dr. Pooja Sharma', '9876543225', 'Gynecology'),
    -> ('Delhi', 'rohit.kumar@example.com', 'Dr. Rohit Kumar', '9876543235', 'ENT specialist'),
    -> ('Delhi', 'vikas.verma@example.com', 'Dr. Vikas Verma', '9876543232', 'Dermatology'),
    -> ('Delhi', 'anjali.gupta@example.com', 'Dr. Anjali Gupta', '9876543226', 'Gynecology'),
    -> ('Delhi', 'ankit.verma@example.com', 'Dr. Ankit Verma', '9876543229', 'Gynecology'),
    -> ('Delhi', 'neha.verma@example.com', 'Dr. Neha Verma', '9876543214', 'Orthopedic'),
    -> ('Delhi', 'priyanka.sharma@example.com', 'Dr. Priyanka Sharma', '9876543236', 'ENT specialist'),
    -> ('Delhi', 'simran.singh@example.com', 'Dr. Simran Singh', '9876543231', 'Dermatology'),
    -> ('Delhi', 'amit.sharma@example.com', 'Dr. Amit Sharma', '9876543230', 'Dermatology'),
    ->
    -> ('Noida', 'anil.kapoor@example.com', 'Dr. Anil Kapoor', '9876543240', 'Gynecology'),
    -> ('Noida', 'rohit.kumar@example.com', 'Dr. Rohit Kumar', '9876543250', 'ENT specialist'),
    -> ('Noida', 'priya.singh@example.com', 'Dr. Priya Singh', '9876543216', 'Orthopedic'),
    -> ('Noida', 'anjali.sharma@example.com', 'Dr. Anjali Sharma', '9876543217', 'Orthopedic'),
    -> ('Noida', 'priyanka.gupta@example.com', 'Dr. Priyanka Gupta', '9876543219', 'Orthopedic'),
    -> ('Noida', 'mohan.verma@example.com', 'Dr. Mohan Verma', '9876543215', 'Orthopedic'),
    -> ('Noida', 'neha.verma@example.com', 'Dr. Neha Verma', '9876543248', 'Dermatology'),
    -> ('Noida', 'deepak.kumar@example.com', 'Dr. Deepak Kumar', '9876543218', 'Orthopedic'),
    -> ('Noida', 'karan.kapoor@example.com', 'Dr. Karan Kapoor', '9876543249', 'Dermatology'),
    -> ('Noida', 'vikram.singh@example.com', 'Dr. Vikram Singh', '9876543246', 'Dermatology'),
    ->
    -> ('Faridabad', 'vishal.sharma@example.com', 'Dr. Vishal Sharma', '9876543222', 'Orthopedic'),
    -> ('Faridabad', 'pooja.sharma@example.com', 'Dr. Pooja Sharma', '9876543260', 'Dermatology'),
    -> ('Faridabad', 'neha.verma@example.com', 'Dr. Neha Verma', '9876543263', 'Dermatology'),
    -> ('Faridabad', 'rohit.kumar@example.com', 'Dr. Rohit Kumar', '9876543265', 'ENT specialist'),
    -> ('Faridabad', 'anil.kapoor@example.com', 'Dr. Anil Kapoor', '9876543255', 'Gynecology'),
    -> ('Faridabad', 'priyanka.sharma@example.com', 'Dr. Priyanka Sharma', '9876543266', 'ENT specialist'),
    -> ('Faridabad', 'nisha.singh@example.com', 'Dr. Nisha Singh', '9876543221', 'Orthopedic'),
    -> ('Faridabad', 'simran.gupta@example.com', 'Dr. Simran Gupta', '9876543258', 'Gynecology'),
    -> ('Faridabad', 'rakesh.singh@example.com', 'Dr. Rakesh Singh', '9876543257', 'Gynecology'),
    -> ('Faridabad', 'karan.kapoor@example.com', 'Dr. Karan Kapoor', '9876543264', 'Dermatology');
    
    
    
    
    -------


mysql> INSERT INTO patient (city, email, name, phone_number, symptom) VALUES
    -> ('Delhi', 'patient1@example.com', 'John Doe', '9876543210', 'Arthritis'),
    -> ('Noida', 'patient2@example.com', 'Jane Smith', '9876543211', 'Dysmenorrhea'),
    -> ('Faridabad', 'patient3@example.com', 'Alice Johnson', '9876543212', 'Skin infection'),
    -> ('Delhi', 'patient4@example.com', 'Bob Williams', '9876543213', 'Ear pain'),
    -> ('Noida', 'patient5@example.com', 'Emily Brown', '9876543214', 'Backpain'),
    -> ('Faridabad', 'patient6@example.com', 'Michael Wilson', '9876543215', 'Tissue injuries'),
    -> ('Delhi', 'patient7@example.com', 'Sophia Garcia', '9876543216', 'Skin burn'),
    -> ('Noida', 'patient8@example.com', 'Matthew Martinez', '9876543217', 'Arthritis'),
    -> ('Faridabad', 'patient9@example.com', 'Olivia Anderson', '9876543218', 'Dysmenorrhea'),
    -> ('Delhi', 'patient10@example.com', 'James Taylor', '9876543219', 'Arthritis'),
    -> ('Noida', 'patient11@example.com', 'Emma Davis', '9876543220', 'Backpain'),
    -> ('Faridabad', 'patient12@example.com', 'Noah Rodriguez', '9876543221', 'Ear pain'),
    -> ('Delhi', 'patient13@example.com', 'Ava Lopez', '9876543222', 'Skin infection'),
    -> ('Noida', 'patient14@example.com', 'William Thomas', '9876543223', 'Tissue injuries'),
    -> ('Faridabad', 'patient15@example.com', 'Isabella Jackson', '9876543224', 'Skin burn'),
    -> ('Delhi', 'patient16@example.com', 'Mia Harris', '9876543225', 'Arthritis'),
    -> ('Noida', 'patient17@example.com', 'Benjamin White', '9876543226', 'Dysmenorrhea'),
    -> ('Faridabad', 'patient18@example.com', 'Charlotte Lee', '9876543227', 'Ear pain'),
    -> ('Delhi', 'patient19@example.com', 'Ethan Martin', '9876543228', 'Backpain'),
    -> ('Noida', 'patient20@example.com', 'Amelia Thompson', '9876543229', 'Tissue injuries'),
    -> ('Faridabad', 'patient21@example.com', 'Liam Garcia', '9876543230', 'Skin burn'),
    -> ('Delhi', 'patient22@example.com', 'Oliver Hall', '9876543231', 'Arthritis'),
    -> ('Noida', 'patient23@example.com', 'Harper Young', '9876543232', 'Dysmenorrhea'),
    -> ('Faridabad', 'patient24@example.com', 'Evelyn King', '9876543233', 'Ear pain'),
    -> ('Delhi', 'patient25@example.com', 'Lucas Green', '9876543234', 'Skin infection'),
    -> ('Noida', 'patient26@example.com', 'Avery Scott', '9876543235', 'Backpain'),
    -> ('Faridabad', 'patient27@example.com', 'Jackson Hill', '9876543236', 'Tissue injuries'),
    -> ('Delhi', 'patient28@example.com', 'Ella Adams', '9876543237', 'Skin burn'),
    -> ('Noida', 'patient29@example.com', 'Aiden Nelson', '9876543238', 'Arthritis'),
    -> ('Faridabad', 'patient30@example.com', 'Scarlett Rivera', '9876543239', 'Dysmenorrhea');