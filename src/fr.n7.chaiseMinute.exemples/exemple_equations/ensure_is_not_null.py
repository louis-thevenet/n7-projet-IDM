import numpy as np

def ensure_is_not_null(x):
    return (np.array(x)!=0).all()
