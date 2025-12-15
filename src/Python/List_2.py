def count_evens(nums):
    if (nums == []):
        return 0

    if (nums[0]%2 == 0):
        return 1+ count_evens(nums[1:len(nums)])
    return count_evens(nums[1:len(nums)])
def big_diff(nums):
    big, small =nums[0], nums[0]
    for item in nums:
        big = max(big, item)
        small = min(small, item)

    return big-small
def centered_average(nums):
    big, small =nums[0], nums[0]
    count = 0
    for item in nums:
        big = max(big, item)
        small = min(small, item)
        count+=item

    return (count-big-small)/(len(nums)-2)
def sum13(nums):
    while 13 in nums:
        if nums.index(13) < len(nums)-1:
            nums.pop(nums.index(13)+1)
        nums.pop(nums.index(13))

    return sum(nums)
def sum67(nums):
    count = 0
    blocked = False

    for n in nums:
        if n == 6:
            blocked = True
            continue
        if n == 7 and blocked:
            blocked = False
            continue
        if not blocked:
            count += n

    return count
def has22(nums):
    for i,v in enumerate(nums[:-1]):
        if v == 2 and nums[i+1] == 2:
            return True
    return False
