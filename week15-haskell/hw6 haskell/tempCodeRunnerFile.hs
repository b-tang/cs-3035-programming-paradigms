ion to merge two sorted lists
-- main = do
--     merge :: Ord a => [a] -> [a] -> (a -> a -> Bool) -> [a]

--     merge xs [] _ = xs
--     merge [] ys _ = ys
--     merge (x:xs) (y:ys) l 
--     | l x y    = x : merge xs (y:ys) l
--     | otherwise = y : merge (x:xs) ys l

--     -- mergeSort function to divide list and call merge
--     mergeSort :: Ord a => [a] -> (a -> a -> Bool) -> [a]
--     mergeSort [] _ = []
--     mergeSort [x] _ = [x]
--     mergeSort xs l = merge (mergeSort a1 l) (mergeSort b1 l) l
--     where
--         (a1,b1) = splitAt (length xs `div` 2) xs


--     l1 :: Ord a => a -> a -> Bool
--     l2 :: Ord a => a -> a -> Bool

--     -- lambda expressions to create function to compare numbers
--     l1 = \a b -> if a <= b then True else False
--     l2 = \a b -> if a >= b then True else False

--     print(mergeSort ([1,4,-1,7,10,9] l1))
--     -- mergeSort [1,4,-1,7,10,9] l2
--     -- mergeSort [1,4,-1,7,10,9,-8] l2
--     -- mergeSort [1,4,-1,7,10,9,-8] l1