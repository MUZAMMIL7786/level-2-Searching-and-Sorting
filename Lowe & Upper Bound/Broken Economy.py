// https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/ceil-floor-official/ojquestion
n= int(input())

lists= []

for i in range(0, n):
    ele= int(input())
    lists.append(ele)
    
key= int(input())

# Write your code here

left = 0; right = n-1;
ans = []
while(left <= right):
    mid = (left+right)//2;
    if(lists[mid] < key):
        left = mid+1
        ans = [lists[mid+1], lists[mid]]
    elif(lists[mid] > key):
        right = mid-1;
        ans = [lists[mid], lists[mid-1]]
    else:
        print(lists[mid])
print(ans[0])
print(ans[1])
