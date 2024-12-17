import numpy as np

def ensure_min_max(minl,maxl):
    return (np.array(maxl) >= np.array(minl)).all()
