import React from 'react';
import PropTypes from 'prop-types';

    const Register =() =>{
        return(
            <>
            <form >
                <div class="form-group">
            <h1> Register Page</h1>
            <div class="form-group">
                <label for="name">Name</label>
                <input type='text' required />
                
            </div>
            <div class="form-group">
                <label for="email">Name</label>
                <input type='email' required />
                
            </div>
            <div class="form-group">
                <label for="password">Name</label>
                <input type='password' required />
                
            </div>
            <div class="form-group">
                <label for="confirm-password">Name</label>
                <input type='password' required />
                
            </div>
            
            </div>
            </form>
            
            </>
        );
    }



export default Register;