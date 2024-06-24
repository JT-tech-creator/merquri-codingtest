SELECT p.Name, s.Sport, s.Score AS "Total Score"
FROM scores s
INNER JOIN players p ON s.Player_no = p.Player_no
ORDER BY p.Name, s.Sport, s.Score DESC;
