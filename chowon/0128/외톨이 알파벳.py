def solution(input_string):
    answer = ''

    for p in range(0,len(input_string)):
        if input_string[p] in answer: continue
        for q in range(p+1,len(input_string)):
            if input_string[p] == input_string[q]:
                if ((q-p) == 1): break
                elif ((q-p) > 1):
                    answer += input_string[p]
                    break

    if len(answer) == 0 : return 'N'
    else: return ''.join(sorted(answer))
