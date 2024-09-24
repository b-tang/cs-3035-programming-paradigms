from Entry import Entry

class PQ:
    def __init__(self):
        self.entries = []

    def add(self, priority, value):
        entry = Entry(priority, value)
        self.entries.append(entry)

    def remove_min(self):
        lowest_prio = self.entries[0].get_priority()
        for index in self.entries:
            if index.get_priority() < lowest_prio:
                lowest_prio = index.get_priority()

        entry_removed = None
        for index in self.entries:
            if index.get_priority() == lowest_prio:
                entry_removed = index
                self.entries.remove(index)
                break
        return entry_removed

    def set_priority(self, value, new_priority):
        for index in self.entries:
            if index.get_value() == value:
                index.set_priority(new_priority)

    def size(self):
        return len(self.entries)