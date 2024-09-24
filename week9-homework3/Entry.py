class Entry:
    def __init__(self, priority, value):
        self._priority = priority
        self._value = value

    def set_priority(self, priority):
        self._priority = priority

    def get_priority(self):
        return self._priority

    def get_value(self):
        return self._value

    def __str__(self):
        return f"Priority: {self._priority}; Value: {self._value}"