#1. 영화 '퍼스트 맨'의 제작 연도, 영문 제목, 러닝 타임, 플롯을 출력하세요.
select ReleaseYear, Title, RunningTime, Plot from Movie WHERE KoreanTitle = '퍼스트 맨';
#2. 2003년에 개봉한 영화의 한글 제목과 영문 제목을 출력하세요
select Title, KoreanTitle from movie WHERE ReleaseYear = 2002;
#3. 영화 '글래디에이터'의 작곡가를 고르세요
select * from person WHERE PersonID = (select PersonID from appear WHERE MovieID = (select MovieID from Movie WHERE KoreanTitle = '글래디에이터') AND RoleID=(select RoleID from role WHERE RoleKorName = '작곡'));
#4. 영화 '매트릭스' 의 감독이 몇명인지 출력하세요
select Count(*) from person where PersonID IN (select PersonID from appear WhERE MovieID = (select MovieID from Movie WHERE KoreanTitle = '매트릭스') AND RoleID = (select RoleID from role where RoleKorName = '감독'));
#5. 감독이 2명 이상인 영화를 출력하세요
SELECT * FROM movie WHERE MovieID IN (SELECT MovieID FROM (SELECT MovieID, COUNT(*) FROM appear WHERE RoleID=(SELECT RoleID FROM role WHERE RoleKorName='감독') GROUP BY MovieID Having COUNT(*)>1) dir);
#6. '한스 짐머'가 참여한 영화 중 아카데미를 수상한 영화를 출력하세요
select * from movie where MovieID IN (select MovieID from appear WHERE AppearID  IN (select AppearID from (select AppearID from awardinvolve where WinningID = 2) winId WHERE PersonID = (select PersonID from person WHERE KoreanName = '한스 짐머')));
#7. 감독이 '제임스 카메론'이고 '아놀드 슈워제네거'가 출연한 영화를 출력하세요
select * from movie where MovieID IN (select MovieID from appear WHERE MovieID IN(select MovieID from appear WHERE PersonID = (select PersonID from person where KoreanName = '제임스 카메론') AND RoleID = (select RoleID from role where RoleKorName = '감독')) AND PersonID = (select PersonID from person where KoreanName = '아놀드 슈워제네거'));
#8. 상영시간이 100분 이상인 영화 중 레오나르도 디카프리오가 출연한 영화를 고르시오
select * from movie where RunningTime>=100 AND MovieID IN (select MovieID from appear  where PersonID = (select PersonID from person where KoreanName = '레오나르도 디카프리오'));
#9. 청소년 관람불가 등급의 영화 중 가장 많은 수익을 얻은 영화를 고르시오
select * from movie where BoxOfficeWWGross=(select MAX(BoxOfficeWWGross)from movie Where GradeInKoreaID IN (select GradeInKoreaID from gradeinkorea where GradeInKoreaName = '청소년 관람불가'));
#10. 1999년 이전에 제작된 영화의 수익 평균을 고르시오
select AVG(BoxOfficeWWGross) from movie where ReleaseYear <1999;
#11. 가장 많은 제작비가 투입된 영화를 고르시오.
select * from movie where Budget = (select MAX(Budget) from movie);
#12. 제작한 영화의 제작비 총합이 가장 높은 감독은 누구입니까?
SELECT p.KoreanName FROM movie AS m
         JOIN appear AS a ON m.MovieID = a.MovieID
         JOIN person AS p ON a.PersonID = p.PersonID
         JOIN role AS r ON a.RoleID = r.RoleID
WHERE r.RoleName = 'Director' GROUP BY p.KoreanName ORDER BY SUM(m.Budget) DESC LIMIT 1;
#13. 출연한 영화의 모든 수익을 합하여, 총 수입이 가장 많은 배우를 출력하세요.
SELECT p.KoreanName FROM person AS p
         JOIN appear AS a ON p.PersonID = a.PersonID
         JOIN movie AS m ON a.MovieID = m.MovieID
GROUP BY p.KoreanName ORDER BY SUM(m.BoxOfficeWWGross) DESC LIMIT 1;
#14. 제작비가 가장 적게 투입된 영화의 수익을 고르세요. (제작비가 0인 영화는 제외합니다)
select MIN(BoxOfficeWWGross) from movie where Budget <> 0;
#15. 제작비가 5000만 달러 이하인 영화의 미국내 평균 수익을 고르세요
select AVG(BoxOfficeUSGross) from movie where Budget <=50000000;
#16. 액션 장르 영화의 평균 수익을 고르세요
select AVG(BoxOfficeWWGross) from movie where MovieID IN (select MovieID from moviegenre where GenreID = (select GenreID from genre where GenreKorName='액션'));
#17. 드라마, 전쟁 장르의 영화를 고르세요.
select * from movie where MovieID IN
(select a.MovieID from ((select * from moviegenre where GenreID=(select GenreID from genre where GenreKorName='드라마')) a INNER JOIN (select * from moviegenre where GenreID=(select GenreID from genre where GenreKorName='전쟁')) b ON a.MovieID=b.MovieID));
#18. 톰 행크스가 출연한 영화 중 상영 시간이 가장 긴 영화의 제목, 한글제목, 개봉연도를 출력하세요.
SELECT m.Title, m.KoreanTitle, m.ReleaseYear FROM movie AS m
         JOIN appear AS a ON m.MovieID = a.MovieID
         JOIN person AS p ON a.PersonID = p.PersonID
WHERE p.KoreanName = '톰 행크스' ORDER BY m.RunningTime DESC limit 1;
#19. 아카데미 남우주연상을 가장 많이 수상한 배우를 고르시오
SELECT KoreanName FROM person WHERE PersonID=(
SELECT PersonID From appear WHERE AppearID IN (SELECT AppearID FROM awardinvolve WHERE sectorID IN (SELECT sectorID FROM sector WHERE SectorKorName='남우주연상') AND WinningID=2) GROUP BY PersonID ORDER BY Count(*) DESC LIMIT 1);
#20. 아카데미상을 가장 많이 수상한 배우를 고르시오 ('수상자 없음'이 이름인 영화인은 제외합니다)
SELECT p.KoreanName FROM person AS p
         JOIN appear AS a ON p.PersonID = a.PersonID
         JOIN awardinvolve AS ai ON a.AppearID = ai.AppearID
         JOIN awardyear AS ay ON ai.AwardYearID = ay.AwardYearID
         JOIN award AS aw ON ay.AwardID = aw.AwardID
         JOIN winning AS w ON ai.WinningID = w.WinningID
WHERE (aw.AwardEnglishTitle = 'Academy Award' AND w.WinOrNot = 'Winner'   AND p.KoreanName <> '수상자 없음') GROUP BY p.KoreanName ORDER BY Count(*) DESC LIMIT 1;
#21. 아카데미 남우주연상을 2번 이상 수상한 배우를 고르시오
SELECT p.KoreanName FROM person AS p
         JOIN appear AS a ON p.PersonID = a.PersonID
         JOIN awardinvolve AS ai ON a.AppearID = ai.AppearID
         JOIN awardyear AS ay ON ai.AwardYearID = ay.AwardYearID
         JOIN award AS aw ON ay.AwardID = aw.AwardID
         JOIN sector AS s ON ai.SectorID = s.SectorID
         JOIN winning AS w ON ai.WinningID = w.WinningID
WHERE (aw.AwardEnglishTitle = 'Academy Award' AND s.SectorKorName = '남우주연상' AND w.WinOrNot = 'Winner') GROUP BY p.KoreanName HAVING COUNT(*) >= 2 ORDER BY COUNT(*) DESC;
#23. 아카데미상을 가장 많이 수상한 사람을 고르세요.
SELECT p.KoreanName FROM person AS p
         JOIN appear AS a ON p.PersonID = a.PersonID
         JOIN awardinvolve AS ai ON a.AppearID = ai.AppearID
         JOIN awardyear AS ay ON ai.AwardYearID = ay.AwardYearID
         JOIN award AS aw ON ay.AwardID = aw.AwardID
         JOIN winning AS w ON ai.WinningID = w.WinningID
WHERE aw.AwardEnglishTitle = 'Academy Award' AND w.WinOrNot = 'Winner' AND p.KoreanName <> '수상자 없음' GROUP BY p.KoreanName ORDER BY COUNT(*) DESC LIMIT 1;
#24. 아카데미상에 가장 많이 노미네이트 된 영화를 고르세요.
SELECT m.KoreanTitle FROM movie AS m
         JOIN appear AS a ON m.MovieID = a.MovieID
         JOIN awardinvolve AS ai ON a.AppearID = ai.AppearID
         JOIN awardyear AS ay ON ai.AwardYearID = ay.AwardYearID
         JOIN award AS aw ON ay.AwardID = aw.AwardID
         JOIN winning AS w ON ai.WinningID = w.WinningID
WHERE aw.AwardEnglishTitle = 'Academy Award' AND w.WinOrNot='Nominated' GROUP BY m.MovieID ORDER BY COUNT(*) DESC LIMIT 1;
#25. 가장 많은 영화에 출연한 여배우를 고르세요.
SELECT p.KoreanName FROM person AS p
         JOIN appear AS a ON p.PersonID = a.PersonID
         JOIN role AS r ON a.RoleID = r.RoleID
WHERE r.RoleName = 'actress' GROUP BY p.KoreanName ORDER BY COUNT(a.MovieID) DESC LIMIT 1;
#26. 수익이 가장 높은 영화 TOP 10을 출력하세요.
select * from movie ORDER BY BoxOfficeWWGross DESC LIMIT 10;
#27. 수익이 10억불 이상인 영화중 제작비가 1억불 이하인 영화를 고르시오.
select * from movie where MovieID IN (select a.MovieID from(select MovieID from movie where Budget <100000000) a INNER JOIN (select MovieID from movie where BoxOfficeWWGross >=100000000) b ON a.MovieID = b.MovieID);
#28. 전쟁 영화를 가장 많이 감독한 사람을 고르세요.
SELECT p.KoreanName FROM appear AS a
         JOIN movie AS m ON a.MovieID = m.MovieID
         JOIN person AS p ON a.PersonID = p.PersonID
         JOIN moviegenre AS mg ON m.MovieID = mg.MovieID
         JOIN genre AS g ON mg.GenreID = g.GenreID
WHERE g.GenreKorName = '전쟁' AND a.RoleID = 2 GROUP BY p.KoreanName ORDER BY COUNT(a.MovieID) DESC LIMIT 1;
#29. 드라마에 가장 많이 출연한 사람을 고르세요.
SELECT p.KoreanName FROM person AS p
         JOIN appear AS a ON p.PersonID = a.PersonID
         JOIN moviegenre AS mg ON a.MovieID = mg.MovieID
         JOIN genre AS g ON mg.GenreID = g.GenreID
WHERE g.GenreKorName = '드라마' AND p.KoreanName <> '수상자 없음' GROUP BY p.KoreanName ORDER BY COUNT(DISTINCT a.MovieID) DESC LIMIT 1;
#30. 드라마 장르에 출연했지만 호러 영화에 한번도 출연하지 않은 사람을 고르세요.
SELECT p.KoreanName FROM person AS p
         JOIN appear AS a ON p.PersonID = a.PersonID
         JOIN moviegenre AS mg ON a.MovieID = mg.MovieID
         JOIN genre AS g ON mg.GenreID = g.GenreID
WHERE (g.GenreKorName = '드라마' AND p.KoreanName IS NOT NULL AND TRIM(p.KoreanName) <> '' AND p.KoreanName NOT IN (
    SELECT DISTINCT p2.KoreanName FROM person AS p2
             JOIN appear AS a2 ON p2.PersonID = a2.PersonID
             JOIN moviegenre AS mg2 ON a2.MovieID = mg2.MovieID
             JOIN genre AS g2 ON mg2.GenreID = g2.GenreID
    WHERE g2.GenreName = 'Horror'
));
#31. 아카데미 영화제가 가장 많이 열린 장소는 어디인가요?
SELECT Location FROM awardyear AS ay
         JOIN award AS a ON ay.AwardID = a.AwardID
WHERE a.AwardEnglishTitle = 'Academy Award' GROUP BY Location ORDER BY COUNT(*) DESC LIMIT 1;
#33. 첫 번째 아카데미 영화제가 열린지 올해 기준으로 몇년이 지났나요?
select YEAR(CURRENT_DATE()) - (select Year from awardyear ORDER BY Date LIMIT 1) AS a;