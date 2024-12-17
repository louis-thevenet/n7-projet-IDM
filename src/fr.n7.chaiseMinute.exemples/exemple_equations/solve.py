import numpy as np
import math

def solve(deltas, a,b,c):
    solutions = []
    for i in range(len(a)):

        if deltas[i] > 0:
            sqrt_delta = math.sqrt(deltas[i])
            solutions.append([(-b[i] - sqrt_delta)/(2*a[i]), (-b[i] + sqrt_delta)/(2*a[i])])
        elif deltas[i] < 0:
            solutions.append(["No solution"])
        else:
            solutions.append([-b[i] / (2*a[i])])
    return solutions

    
