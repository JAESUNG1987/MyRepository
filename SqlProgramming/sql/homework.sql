--ch02
--1. 3번 like
--2. 3번 between
--3. 2번 or
--4. 2번 where
--5. 1번 order by
--6. 1번 is null
--7. 
select empno, ename
from emp 
order by empno desc;
--8. distinct

--ch03
--1.
select *
from emp
where mod(empno,2)=1;
--2.
select hiredate, to_char(hiredate, 'YYYY') as 년도,
                 to_char(hiredate, 'MM') as 월,
                 to_char(hiredate, 'DD') as 일
from emp;
--3.
select round(sysdate-hiredate) as 근무일수 
from emp;
--4.
select empno, ename, nvl(to_char(mgr,'9999'),'C E O') as 직속상관
from emp
where mgr is null;
--5. dual
--6. 
select sysdate+100
from dual;
--7.
select last_day(sysdate)
from dual;
--8.
comm 값이 있을 경우 sal+comm 값을 추출하고 comm 값이 없을 경우에는 sal값을 출력
--9. case
--10. sysdate


--ch04
--1. 3번 group by
--2. 1번 having
--3. 3번
--4. 1번 having
--5. 1번 max
--6. 1번 case
--7. 
select count(comm) as 사원수
from emp;
--8.
select to_date(max(hiredate), 'YY/MM/DD'),
       to_date(min(hiredate), 'YY/MM/DD')
from emp;
--9.

--ch07
--1. 2번 modify
--2. 1번 alter table
--3.
ddl(데이터 정의어) ddl은 테이블의 구조 자체를 생성,수정,제거하도록 하는 명령문의 집합.
create - 테이블 구조를 만듬
alter - 테이블 구조를 변경
drop - 테이블 구조를 제거

--ch08
--1. 3번
--2. 4번
--3. 2번 set
--4. 2번 commit
--5. 3번
--6. 3번 트랜잭션
--7.
dml 데이터를 추가,수정,삭제하는 명령어
실행됨과 동시에 트랜잭션이 진행
commit - 모든 작업들을 정상적으로 처리하겠다고 확정하는 명령어
rollback - 작업 중 문제가 발생해서 트랜잭션의 처리 과정에서 발생한 변경 사항을 취소하는 명령어

--ch09
--1. 1번
--2. 2번
--3. 2번

--ch10
--1. 4번
--2. 
--3. 
--4. 
--5. 4번
--6. 3번
--7. 4번
--8. 4번
--9. 1번
--10. 
select e.ename, d.deptno, d.dname
from emp e inner join dept d
on e.deptno = d.deptno 
order by d.deptno;
--11.
select e.ename, e.hiredate
from emp e, dept d 
where e.deptno =d.deptno                    
and d.dname='경리부';
--13.
select e.ename, d.dname
from emp e, dept d                          
where e.deptno =d.deptno                                           
and e.job='과장';
--14.
select work.ename, work.job
from emp work, emp manager                          
where work.mgr=manager.empno                                                
and manager.ename='감우성';
--15.
select work.ename, friend.ename
from emp work, emp friend                           
where work.deptno=friend.deptno
and work.ename='감우성'                         
and friend.ename<>'감우성';

--ch11
--1. 1번
--2. 3번
--3. 3번
--4. 4번
--5.
--6.
--7. 
create table emp06
as 
select * from emp;
--8.
select ename, sal
from emp06
where sal > any ( select sal 
                     from emp
                     where job='과장')
and job <> '과장';
--9.
update emp06 
set sal=sal+100
where deptno=(select deptno
               from dept
               where loc='인천');

select * from emp06 order by deptno;


select * from emp06;
--10.
delete from emp06 
where deptno=(select deptno
               from dept
               where dname='경리부');
--12.
select *
from emp
where job = ( select job
               from emp 
               where  ename='이문세')
and ename<>'이문세';
--13.
select ename, sal
from emp
where sal >=  ( select sal
                 from emp 
                 where  ename='이문세')
and ename<>'이문세';
--14.
select ename, deptno
from emp
where deptno = ( select deptno
                  from dept
                  where loc='인천');
--15.
select ename, sal, mgr
from emp
where mgr= ( select empno
              from emp 
              where ename='감우성');
--16.
select empno, ename, sal, deptno
from emp e
where sal = ( select max(sal) 
             from emp 
             where deptno=e.deptno)
order by deptno;
--17.
select *
from dept
where deptno in (select deptno
               from emp
               where job='과장');
--18.
select ename, sal, job
from emp
where sal > all ( select sal 
                       from emp 
                       where job='과장');

--ch13
--1. 시퀀스
--2.
currval : 현재값을 반환
next val : 다음 값이란 의미를 가지며 현재 시퀀스 값의 다음 값을 반환
--3. 1번
--4. 인덱스
--5. 고유
--6. drop index idx_emp_empno;
--7. drop sequence seq_empno;






