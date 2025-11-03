def main():
    n = int(input())
    target = list(input().split())

    result_bubble = bubble_sort(n, target)
    print(*result_bubble)

    if is_stable(n, target, result_bubble):
        print("Stable")
    else:
        print("Not stable")
    
    result_selection = selection_sort(n, target)
    print(*result_selection)

    if is_stable(n, target, result_selection):
        print("Stable")
    else:
        print("Not stable")


def bubble_sort(n, target):
    cp_target = target.copy()
    for i in range(n):
        for j in range(n-1, i, -1):
            if int(cp_target[j][1]) < int(cp_target[j-1][1]):
                tmp = cp_target[j]
                cp_target[j] = cp_target[j-1]
                cp_target[j-1] = tmp
    return cp_target

def selection_sort(n, target):
    cp_target = target.copy()
    for i in range(n):
        mini = i
        for j in range(i, n):
            if int(cp_target[j][1]) < int(cp_target[mini][1]):
                mini = j
        tmp = cp_target[i]
        cp_target[i] = cp_target[mini]
        cp_target[mini] = tmp
    return cp_target

def is_stable(n, before, after):
    for i in range(n):
        for j in range(i+1, n):
            for a in range(n):
                for b in range(a+1, n):
                    if before[i][1] == before[j][1] and after[b] == before[i] and after[a] == before[j]:
                        return False
    return True

if __name__ == "__main__":
    main()