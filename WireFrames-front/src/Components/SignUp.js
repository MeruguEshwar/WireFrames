import { Button } from "@mui/material";
import React from "react";
import DownloadForOfflineIcon from "@mui/icons-material/DownloadForOffline";
import FacebookRoundedIcon from "@mui/icons-material/FacebookRounded";
import TwitterIcon from "@mui/icons-material/Twitter";
import SupportIcon from "@mui/icons-material/Support";

function SignUp() {
  return (
    <div>
      <div className="col-lg-12">
        <div className="col-md-12">
          <div className="col-sm-12">
            <nav className="navbar navbar-expand-lg ">
              <div className="container">
                {/* <a className="navbar-brand" href="#">
                Navbar
              </a> */}
                <button
                  className="navbar-toggler"
                  type="button"
                  data-bs-toggle="collapse"
                  data-bs-target="#navbarSupportedContent"
                  aria-controls="navbarSupportedContent"
                  aria-expanded="false"
                  aria-label="Toggle navigation"
                >
                  <span className="navbar-toggler-icon"></span>
                </button>
                <div
                  className="collapse navbar-collapse "
                  id="navbarSupportedContent"
                >
                  <ul className="navbar-nav me-auto mb-2 mb-lg-0">
                    <li className="nav-item">
                      <a
                        className="nav-link active"
                        aria-current="page"
                        href="#"
                      >
                        <h3 className="text-light fw-bold">MediaFire</h3>
                      </a>
                    </li>
                  </ul>
                  <form className="d-flex" role="search">
                    <Button
                      variant="contained"
                      startIcon={<DownloadForOfflineIcon />}
                      className="me-2"
                      style={{
                        backgroundColor: "#33cc66",
                        color: "black",
                        fontSize: "12px",
                      }}
                    >
                      UPGRADE
                    </Button>
                    <Button
                      variant="contained"
                      style={{ fontSize: "12px" }}
                      //   onClick={redirectTosignUp}
                    >
                      <SupportIcon className="me-1" />
                      HELP
                    </Button>
                    <Button
                      variant="contained"
                      endIcon={<FacebookRoundedIcon />}
                      className="ms-1"
                      style={{ fontSize: "12px" }}
                    >
                      LOGIN
                      <TwitterIcon className="ms-1" />
                    </Button>
                  </form>
                </div>
              </div>
            </nav>

            <div className="card-group container mt-5 d-flex justify-content-center">
              <div className="card rounded" style={{ maxWidth: "20rem" }}>
              <div class="freeShippingRibbon">50% Off</div>
                <div class="card-header bg-transparent">
                  <h5>PRO</h5>
                  <p>1 User</p>
                  <p>1 TB (1000 GB)</p>
                  <p>$7.50/month</p>
                  <p>$3.75/month</p>
                  <p className="text-center">
                    billed annually or $5.00 month-to-month
                  </p>
                  <button className="btn btn-primary">GET PRO</button>
                </div>
                <div className="card-body">
                  <h5 className="card-title"></h5>
                  <p className="card-text">
                    This is a wider card with supporting text below as a natural
                    lead-in to additional content. This content is a little bit
                    longer.
                  </p>
                  <p className="card-text">
                    <small className="text-muted">
                      Last updated 3 mins ago
                    </small>
                  </p>
                </div>
              </div>
              <div
                className="card ms-5 me-5 border-start rounded"
                style={{ maxWidth: "20rem" }}
              >
                <div class="freeShippingRibbon">50% Off</div>
                <div class="card-header bg-transparent">
                  <h5>BUSSINESS</h5>
                  <p>1 User</p>
                  <p>1 TB (1000 GB)</p>
                  <p>$7.50/month</p>
                  <p>$3.75/month</p>
                  <p className="text-center">
                    billed annually or $5.00 month-to-month
                  </p>
                  <button className="btn btn-primary">GET BUSSINESS</button>
                </div>
                <div className="card-body">
                  <h5 className="card-title">Card title</h5>
                  <p className="card-text">
                    This card has supporting text below as a natural lead-in to
                    additional content.
                  </p>
                  <p className="card-text">
                    <small className="text-muted">
                      Last updated 3 mins ago
                    </small>
                  </p>
                </div>
              </div>
              <div
                className="card border-start rounded"
                style={{ maxWidth: "20rem" }}
              >
                <div class="freeShippingRibbon">50% Off</div>
                <div class="card-header bg-transparent">
                  <h5>BASIC</h5>
                  <p>1 User</p>
                  <p>1 TB (1000 GB)</p>
                  <p>$7.50/month</p>
                  <p>$3.75/month</p>
                  <p className="text-center">
                    billed annually or $5.00 month-to-month
                  </p>
                  <button className="btn btn-primary">GET BASIC</button>
                </div>
                <div className="card-body">
                  <h5 className="card-title">Card title</h5>
                  <p className="card-text">
                    This is a wider card with supporting text below as a natural
                    lead-in to additional content. This card has even longer
                    content than the first to show that equal height action.
                  </p>
                  <p className="card-text">
                    <small className="text-muted">
                      Last updated 3 mins ago
                    </small>
                  </p>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
}

export default SignUp;
