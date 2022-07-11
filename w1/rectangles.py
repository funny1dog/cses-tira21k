#http://twocentstudios.com/2016/08/16/calculating-the-area-of-multiple-intersecting-rectangles-with-swift/
from operator import itemgetter


def area(rec1, rec2, rec3):
    res = [rec1, rec2, rec3]
    res = sorted(res, key=itemgetter(0, 1))

if __name__ == "__main__":
    rec1 = (-1,1,1,-1)
    rec2 = (0,3,2,0)
    rec3 = (0,2,3,-2)
    print(area(rec1,rec2,rec3)) # 16
