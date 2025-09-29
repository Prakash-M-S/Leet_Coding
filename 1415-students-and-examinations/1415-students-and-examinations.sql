# Write your MySQL query statement below
select st.student_id ,st.student_name, su.subject_name , count(e1.subject_name) as attended_exams
from  Students st
cross join Subjects su
left join Examinations e1
on st.student_id = e1.student_id 
and e1.subject_name = su.subject_name
group by st.student_id, st.student_name, su.subject_name
order by student_id, subject_name;