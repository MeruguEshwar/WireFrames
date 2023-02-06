import { TextField } from '@mui/material'
import React from 'react';
import TwitterIcon from '@mui/icons-material/Twitter';

function Login() {
    return (
        <div>
            <div className='col-lg-12'>
                <div className='col-md-12'>
                    <div className='col-sm-12'>
                        <h1 className='text-center fw-bolder fst-italic mt-5' style={{color:"#0e2866"}}>MediaFire</h1>
                        <div class="card w-60 container mt-5 justify-content-center shadow-lg p-5 mb-5 bg-body-tertiary rounded border border-0">
                            <div class="card-header text-center bg-light border border-0">
                                <p className='fs-2 fw-light'>How do you want to log in ?</p>
                            </div>
                            <div class="card-body">
                                <div className='row mt-3'>
                                    <div className='col-md-6 border-end'>
                                        <div class="mb-3">
                                            <TextField id="standard-basic" label="Email Address" variant="standard" fullWidth />
                                        </div>
                                        <div class="mb-3">
                                            <TextField id="standard-basic" label="Password" variant="standard" fullWidth />
                                        </div>
                                        <div class="row mt-2 mb-2">
                                            <div class="col-md-6">
                                                <div class="form-check">
                                                    <input class="form-check-input" type="checkbox" id="gridCheck" />
                                                    <label class="form-check-label" for="gridCheck">
                                                        Keep me logged in
                                                    </label>
                                                </div>
                                            </div>
                                            <div class="col-md-6">
                                                <p className='float-end'>Forgot password?</p>
                                            </div>
                                        </div>
                                        <div className='d-grid gap-2 mb-4'>
                                            <button type="button" class="btn btn-primary">login</button>
                                        </div>
                                    </div>
                                    <div className='col-lg-6'>
                                        <div class="mb-3 text-center">
                                            <p><TwitterIcon/>Log in with Twitter</p>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="card-footer text-center">
                                Don’t have an account? Create an account
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    )
}

export default Login
