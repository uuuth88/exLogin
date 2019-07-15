-- 리스트 출력
SELECT * FROM tbl_member ORDER BY regdate desc;
-- 회원가입
INSERT INTO tbl_member(member_id, member_pw, member_name, member_email, regdate)
VALUES (#{member_id}, #{member_pw}, #{member_name}, #{member_email}, sysdate)
-- 로그인
SELECT * FROM tbl_member
WHERE member_id = #{member_id} AND member_pw = #{member_pw}