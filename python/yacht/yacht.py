def count(dice):
    counter = {}
    for die in dice:
        try:
            counter[die] += 1
        except KeyError:
            counter[die] = 1
    return counter


def nlet(dice, max):
    first = dice[0]
    for die in dice:
        if die != first:
            return 0
    return max


def ns(dice, n):
    counter = 0
    for die in dice:
        if die == n:
            counter += 1
    return n * counter


def full_house(dice, n):
    counter = count(dice)
    if len(counter) > 2:
        return 0
    return sum(dice)


def n_of_m_kind(dice, times, die):
    counter = count(dice)
    return 0 if len(counter[die]) < times else sum(counter[die])


def four_of_a_kind(dice, die):
    return n_of_m_kind(dice, 4, die)


# Score categories
# Change the values as you see fit
YACHT = (nlet, 50)
ONES = (ns, 1)
TWOS = (ns, 2)
THREES = (ns, 3)
FOURS = (ns, 4)
FIVES = (ns, 5)
SIXES = (ns, 6)
FULL_HOUSE = (full_house, 1)
FOUR_OF_A_KIND = (four_of_a_kind, n)
LITTLE_STRAIGHT = None
BIG_STRAIGHT = None
CHOICE = None


def score(dice, category):
    strategy, n = category
    return strategy(dice, n)
