def double_char(str):
    strs = ""
    for char in str:
        strs += char * 2

    return strs


def count_hi(str):
    count = 0
    for i in range(len(str) - 1):
        if str[i:i + 2] == 'hi':
            count += 1

    return count


def cat_dog(str):
    countcat, countdog = 0, 0
    for i in range(len(str) - 2):
        if str[i:i + 3] == 'cat':
            countcat += 1
        if str[i:i + 3] == 'dog':
            countdog += 1
    return countcat == countdog


def count_code(str):
    count = 0
    for i in range(len(str) - 3):
        if str[i:i + 2] == 'co' and str[i + 3] == 'e':
            count += 1

    return count


def end_other(a, b):
    long_s, short_s = (a, b) if len(a) >= len(b) else (b, a)
    return long_s.lower().endswith(short_s.lower())


def xyz_there(str):
    i = 0
    while "xyz" in str[i:]:
        if str[i - 1 + str[i:].index("xyz")] != ".":
            return True
        i += str[i:].index("xyz") + 2
    return False
