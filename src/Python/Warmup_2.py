def string_times(str, n):
    return str*n

def front_times(str, n):
    if len(str) <3:
        return str*n
    else:
        return str[:3]*n

def string_bits(str):
    return str[::2]

def string_splosion(str):
    temp = ''
    for i in range(len(str)+1):
        temp+= str[:i]

    return temp

def last2(str):
    if len(str) < 2:
        return 0

    last2 = str[len(str)-2:]
    count = 0

    for i in range(len(str)-2):
        sub = str[i:i+2]
        if sub == last2:
            count = count + 1

    return count

def array_count9(nums):
    count = 0
    for num in nums:
        if num == 9:
            count+=1
    return count

def array_front9(nums):
    x= 4
    if len(nums) <4:
        x = len(nums)

    for item in nums[:x]:
        if item == 9:
            return True

    return False

def array123(nums):
    if len(nums)<3:
        return False

    for n in range(len(nums)-2):
        if nums[n:n+3] == [1,2,3]:
            return True

    return False

def string_match(a, b):
    shorter = min(len(a), len(b))
    count = 0

    # Loop i over every substring starting spot.
    # Use length-1 here, so can use char str[i+1] in the loop
    for i in range(shorter-1):
        a_sub = a[i:i+2]
        b_sub = b[i:i+2]
        if a_sub == b_sub:
            count = count + 1

    return count

