CREATE TABLE devices.cpu (
    id BIGINT NOT NULL,
    name varchar(100) NOT NULL,
    cores integer NOT NULL,
    frequency float NOT NULL,
    CONSTRAINT PK_CPU PRIMARY KEY (id)
)
CREATE TABLE devices.gpu (
    id BIGINT NOT NULL,
    name varchar(100) NOT NULL,
    frequency integer NOT NULL,
    memorySize integer NOT NULL,
    countOfFans integer NOT NULL,
    CONSTRAINT PK_GPU PRIMARY KEY (id)
);
CREATE TABLE devices.hardDrive (
    id BIGINT NOT NULL,
    name varchar(100) NOT NULL,
    formFactor float NOT NULL,
    trasferRate integer NOT NULL,
    spindleSpeed integer NOT NULL,
    CONSTRAINT PK_HARDDRIVE PRIMARY KEY (id)
)
    CREATE TABLE devices.memoryType (
    id BIGINT NOT NULL,
    type varchar(100) NOT NULL,
    CONSTRAINT PK_MEMORYTYPE PRIMARY KEY (id)
)
CREATE TABLE devices.ram (
    id BIGINT NOT NULL,
    id_memoryType BIGINT,
    name varchar(100) NOT NULL,
    memorySize integer NOT NULL,
    frequency integer NOT NULL,
    CONSTRAINT PK_RAM PRIMARY KEY (id),
    FOREIGN KEY (id_memoryType) REFERENCES memoryType(id) ON UPDATE CASCADE ON DELETE SET NULL
)
CREATE TABLE devices.device (
    id BIGINT NOT NULL,
    id_cpu BIGINT,
    id_gpu BIGINT,
    id_hardDrive BIGINT,
    id_ram BIGINT,
    CONSTRAINT PK_DEVICE PRIMARY KEY (id),
    FOREIGN KEY (id_cpu) REFERENCES cpu(id) ON UPDATE CASCADE ON DELETE SET NULL,
    FOREIGN KEY (id_gpu) REFERENCES gpu(id) ON UPDATE CASCADE ON DELETE SET NULL,
    FOREIGN KEY (id_hardDrive) REFERENCES hardDrive(id) ON UPDATE CASCADE ON DELETE SET NULL,
    FOREIGN KEY (id_ram) REFERENCES ram(id) ON UPDATE CASCADE ON DELETE SET NULL
)
CREATE TABLE devices.pc (
    id BIGINT NOT NULL,
    id_device BIGINT,
    mouseName varchar(100) NOT NULL,
    keyboardName varchar(100) NOT NULL,
    CONSTRAINT PK_PC PRIMARY KEY CLUSTERED (id),
    FOREIGN KEY (id_device) REFERENCES device(id) ON UPDATE CASCADE ON DELETE SET NULL
)
CREATE TABLE devices.playStation (
    id BIGINT NOT NULL,
    id_device BIGINT,
    version varchar(100) NOT NULL,
    CONSTRAINT PK_PLAYSTATION PRIMARY KEY (id),
    FOREIGN KEY (id_device) REFERENCES device(id) ON UPDATE CASCADE ON DELETE SET NULL
)