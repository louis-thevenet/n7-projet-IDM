import numpy as np

def ensure_all_lower_than_3(x):
    return (np.array(x)<=3).all()
