import React from "react";
import "bootstrap/dist/css/bootstrap.min.css"

const Login = () =>{
    return (
        <>
   <h1 style={{textAlign: 'center',color: '#F6B968'}}>Login</h1>
        <form>
            <div className="form-group">
                <label for="email">
                Email Address
                </label>
                <input type="email" class="form-control" aria-describedby="emailHelp" placeholder="Enter email"/>
                <small id="emailHelp" class="form-text text-muted"> Example format example@example.com</small>
            </div>
            <div className="form-group">
                <label for="exampleInputPassword1">Password</label>
                 <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password"/>
            </div>
            <div class="form-check">
                 <input type="checkbox" class="form-check-input" id="exampleCheck1"/>
                <label class="form-check-label" for="exampleCheck1">Remember me</label>
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>

        </form>
        </>
    );
}
export default Login;