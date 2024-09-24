-- 1
-- mergeSort :: Ord a => [a] -> [a]
-- mergeSort [] = []
-- mergeSort [a] = [a]
-- mergeSort xs = merge (mergeSort (firstHalf xs)) (mergeSort (secondHalf xs))

-- merge :: Ord a => [a] -> [a] -> [a]
-- merge xs [] = xs
-- merge [] ys = ys
-- merge (x:xs) (y:ys) | x <= y = x:merge xs (y:ys) | otherwise = y:merge (x:xs) ys

-- firstHalf :: [a] -> [a]
-- firstHalf  xs = let {n = length xs} in take (div n 2) xs

-- secondHalf :: [a] -> [a]
-- secondHalf xs = let {n = length xs} in drop (div n 2) xs

-- 2
mergeSort :: Ord a => [a] -> (a -> a -> Bool) -> [a]
mergeSort [] _ = []
mergeSort [x] _ = [x]
mergeSort xs l = merge (mergeSort a1 l) (mergeSort b1 l) l where (a1,b1) = splitAt (length xs `div` 2) xs

merge :: Ord a => [a] -> [a] -> (a -> a -> Bool) -> [a]
merge xs [] _ = xs
merge [] ys _ = ys
merge (x:xs) (y:ys) l | l x y = x : merge xs (y:ys) l | otherwise = y : merge (x:xs) ys l

l1 :: Ord a => a -> a -> Bool
l1 = \a b -> if a <= b then True else False

l2 :: Ord a => a -> a -> Bool
l2 = \a b -> if a >= b then True else False

-- Test Code
-- mergeSort [1, 3, -7, 10, 24, 31] l1
-- mergeSort [1, 3, -7, 10, 24, 31, 15] l1
-- mergeSort [1, 3, -7, 10, 24, 31] l2
-- mergeSort [1, 3, -7, 10, 24, 31, 15] l2