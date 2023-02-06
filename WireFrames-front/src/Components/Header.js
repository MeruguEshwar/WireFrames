import { Button } from "@mui/material";
import React from "react";
import { useNavigate } from "react-router-dom";
import DownloadForOfflineIcon from "@mui/icons-material/DownloadForOffline";
import FacebookRoundedIcon from "@mui/icons-material/FacebookRounded";
import TwitterIcon from "@mui/icons-material/Twitter";

function Header() {
  const navigate = useNavigate();

  
  const redirectTosignUp = () => {
    navigate("/signup");
  };

  const redirectTosignIn = () => {
    navigate("/signin");
  };

  return (
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
                    <a className="nav-link active" aria-current="page" href="#">
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
                    onClick={redirectTosignUp}
                  >
                    SIGN UP
                  </Button>
                  <Button
                    variant="contained"
                    endIcon={<FacebookRoundedIcon />}
                    className="me-5"
                    style={{ fontSize: "12px" }}
                    onClick={redirectTosignIn}
                  >
                    LOGIN
                    <TwitterIcon />
                  </Button>
                </form>
              </div>
            </div>
          </nav>
        </div>
      </div>
    </div>
  );
}

export default Header;
