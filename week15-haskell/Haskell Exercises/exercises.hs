-- 1
-- factorial fac = product[1..fac]
-- main = do
--     let num = 3
--     print(factorial num)

--3
-- pythtriples = [(a, b, c) | a <- [1..10], b <- [1..10], c <- [1..10], a ^ 2 + b ^ 2 == c ^ 2]
-- pythtriples2 = [(a, b, c) | a <- [1..10], b <- [1..10], c <- [1..10], a ^ 2 + b ^ 2 == c ^ 2, a <= b, b <= c]
-- main = do
--     putStr "Pythagorean Triples length are: \n"
--     print(pythtriples)
--     print(pythtriples2)

-- 4
-- pythtriples x y = [(a, b, c) | a <- [x..y], b <- [x..y], c <- [x..y], a ^ 2 + b ^ 2 == c ^ 2]
-- main = do
--     putStr "Pythagorean Triples length between x and y is: "
--     print(pythtriples 1 5)

-- 5
-- main = do

-- smaller :: String -> String -> Bool

-- let s1 = readLn

-- let s2 = readLn

-- smaller s1 s2 | len1 /= len2    = (len1 < len2)

--               | otherwise = (s1 < s2)

--               where (len1, len2) = (length s1, length s2)

-- print $ smaller

main = do
    smaller :: String -> String -> Bool
    let s1 = readLn
    let s2 = readLn
        smaller s1 s2 | len1 /= len2 = (len1 < len2) | otherwise = (s1 < s2)
            where(len1, len2) = (length s1, length s2)
            print $ smaller