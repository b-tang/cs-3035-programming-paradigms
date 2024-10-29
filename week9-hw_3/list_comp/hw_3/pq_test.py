from PQ import PQ

pq = PQ()
pq.add(2, "Eat")
pq.add(0, "Study for CS 3035")
pq.add(3, "Sleep")
pq.add(1, "Maintain Personal Relationships")
pq.add(4, "Practice Good Personal Hygiene")
pq.set_priority("Practice Good Personal Hygiene", 2)
pq.set_priority("Eat", 4)

while pq.size() > 0:
    print(pq.remove_min())