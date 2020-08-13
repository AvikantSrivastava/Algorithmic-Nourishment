#!/usr/bin/env python
# coding: utf-8

# In[1]:


from time import time


# In[2]:


# standard recursion 
# no dynamic programming

def f(n):
    if n == 1 or n == 2 :
        result = 1
    else :
        result = f(n-1) + f(n-2)
    
    return result


# In[5]:


tic = time()
print(f(36))
tok = time()
print(tok-tic)


# In[7]:


# memoization method
# using dp

def fm(n,stack = [None]*1000000):
    if n == 0 or n == 1:
        stack[n] = n
        
    if stack[n] is None:
        stack[n] = fm(n-1, stack) + fm(n-2, stack)
   
    return stack[n]
    
    


# In[11]:


tic = time()
print(fm(2550))
tok = time()
print(tok-tic)


# In[ ]:




